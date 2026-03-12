const express = require('express')
const { connectToDb, getDb } = require('./db')
const { ObjectId } = require('mongodb')

// initialize app and middleware

const app = express()
// this allows to req body of json type to use post request
app.use(express.json())

let db

// dbConnection
connectToDb((err) => {
    if (!err) {
        app.listen(3000, () => {
            console.log("we are using port 3000")
        })
        db = getDb()
    }
})

// routes
app.get('/books', (req, res) => {
    let books = []
    // pagination
    const pages = req.query.p || 0
    const perpage = 3
    db.collection('books')
        .find()
        .sort({ author: 1 })
        .skip(pages*perpage)
        .limit(perpage)
        .forEach(book => books.push(book))
        .then(() => {
            res.status(200).json(books)
        })
        .catch(() => {
            res.status(500).json({ error: 'could not fetch the documents' })
    })
})


// to fetch only  sigle record 
app.get('/books/:id', (req,res) => {
    if (ObjectId.isValid(req.params.id)){
        db.collection('books')
            .findOne({_id: new ObjectId(req.params.id)})
            .then(doc => {
                res.status(200).json(doc)
            })
            .catch(error => {
                res.status(500).json({msg: 'could not fetch the document'})
            })
    }
    else{
        res.status(400).json({msg: 'not a valid id'})
    }
})

// post request for that we need to use express.json to accept the req from use 

app.post('/books',(req,res) => {

    const book = req.body  //this will accept the body request from user

    db.collection('books')
        .insertOne(book)
        .then(result => {
            res.status(201).json(result)
        })
        .catch(error => {
            res.status(500).json({msg: 'could not create new document'})
        })
})

// deleting record
app.delete('/books/:id', (req,res) => {
    if(ObjectId.isValid(req.params.id)){
        db.collection('books')
            .deleteOne({_id : new ObjectId(req.params.id)})
            .then(result => {
                res.status(200).json(result)
            })
            .catch(err => {
                res.status(500).json({msg : 'could not able to delete record'})
            })
    } else {
        res.status(500).json({msg : 'not a valid id'})
    }
})

// to update the database records
app.patch('/books/:id', (req,res) => {
    const updates = req.body

    if(ObjectId.isValid(req.params.id)){
        db.collection('books')
            .updateOne({_id : new ObjectId(req.params.id)},{$set: updates})
            .then(result => {
                res.status(200).json(result)
            })
            .catch(err => {
                res.status(501).json({msg: 'could not able to update the doc'})
            })
    } else {
        res.status(500).json({msg: "invalid id"})
    }
})

i=10
j=20
k=i+j
console.log('sum of i and j is '+k)
console.log(`sum of ${i} and ${j} is ${k}`)

document.getElementById("heading1").textContent='hello'

// objects in js

const product={
    prodCode:101,
    prodName:"IPhone",
}

console.log(product)

// fundtions in js

function sum11(i,j){
    return i+j
}

let res=sum11(10,20)
console.log(res)


let nums=[10,20,30]
function sums(...nums){
    let total =0
    for(const x of nums){  // this is es6 syntax
        total += x
    }
    return total
}


let nums1=[10,20,30]
console.log(nums1)

const ob1={
    id:101,
    name:'scott'
}

const ob2={
    dept:'cse',
    salary:5000
}

const ob3={...ob1,...ob2}
console.log(ob3)

// short hand properties

const ename='Scott'
const id=101
const salary=6000
const dept ='Sales'

const employee={
    id,
    ename,dept,
    salary,
}


// Destructuring
const num2=[10,20,30]
// let x=num2[0]
// let y=num2[1]
// let z=num2[2]

let [x,y,z]=num2   //this is destructuring syntax

const sum =(i,j) => i+j
console.log(2,3)

const arr =[4,1,2,54,32,12,45,5]
// let res1 =arr.sort(here we have to implement sorting logic)
let res1 =arr.sort((a,b) => a-b)
console.log(res1)

const numbers12 =[1,2,3,4,5]

let res12=numbers12.map((e) => e*e)
                    .filter(e => e%2 ===0)
                    .forEach(e => console.log(e))



console.log(res12)

// promises

const p1 = new Promise(
    (resolve,reject) => {
        let a =10
        if(a> 5){
            resolve('hello')
        } else {
            reject('error, unable to process request')
        }
    }
)

p1.then(r => {
    console.log('result'+r)
}).catch(r1 =>{
    console.log('error'+ r1)
})

// consuming a promise
console.log('this is before setTime out')
setTimeout(() => {
     console.log('hello')} ,1000)
console.log('this is after set time out')



// closure
function outer(i){
    function inner(){
        console.log(i*3)
    }
    return inner
}

const temp = outer(10)
temp()




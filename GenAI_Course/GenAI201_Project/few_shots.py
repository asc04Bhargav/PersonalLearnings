few_shots = [
    {
        "question": "How many Adidas T-shirts are in stock?",
        "sql_query": "SELECT COUNT(*) FROM inventory WHERE brand = 'Adidas';"
    },
    {
        "question": "What is the total sales for Nike T-shirts in XS size?",
        "sql_query": "SELECT SUM(sales) FROM inventory WHERE brand = 'Nike' AND size = 'XS';"
    },
]

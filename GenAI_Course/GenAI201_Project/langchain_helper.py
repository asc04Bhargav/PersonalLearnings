from langchain.prompts import PromptTemplate
from langchain.llms import OpenAI
import mysql.connector
from dotenv import load_dotenv
import os

# Load environment variables
load_dotenv()

# Database connection settings
DB_HOST = "localhost"
DB_USER = "root"
DB_PASSWORD = "your_password"
DB_NAME = "global_tshirts"

# Function to generate SQL query
def generate_sql_query(user_query):
    prompt_template = PromptTemplate(
        input_variables=["question"],
        template="Convert the following question into an SQL query: {question}",
    )
    prompt = prompt_template.format(question=user_query)
    llm = OpenAI(api_key=os.getenv("GOOGLE_API_KEY"))
    return llm(prompt)

# Function to execute SQL query
def execute_sql_query(sql_query):
    connection = mysql.connector.connect(
        host=DB_HOST,
        user=DB_USER,
        password=DB_PASSWORD,
        database=DB_NAME,
    )
    cursor = connection.cursor()
    cursor.execute(sql_query)
    result = cursor.fetchall()
    cursor.close()
    connection.close()
    return result

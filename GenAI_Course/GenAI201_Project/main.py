import streamlit as st
from langchain_helper import generate_sql_query, execute_sql_query
from dotenv import load_dotenv
import os

# Load environment variables
load_dotenv()

# App title
st.title("GenAI 201 Capstone: Retail Insights Generator")

# User input
query = st.text_input("Enter your natural language query (e.g., 'How many white Adidas T-shirts are left in stock?'):")

# Process input
if st.button("Generate Insights"):
    if query:
        try:
            # Generate SQL query
            sql_query = generate_sql_query(query)
            st.write("Generated SQL Query:")
            st.code(sql_query)

            # Execute SQL query
            result = execute_sql_query(sql_query)
            st.write("Query Result:")
            st.write(result)
        except Exception as e:
            st.error(f"An error occurred: {e}")
    else:
        st.warning("Please enter a query.")

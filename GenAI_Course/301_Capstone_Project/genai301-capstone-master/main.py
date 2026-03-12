import streamlit as st
from langchain_helper import create_vector_db, get_vectorstore

def main():
    st.title("Ed-Tech FAQ Bot")

    # Button to create knowledge base
    if st.button("Create Knowledge Base"):
        create_vector_db()
        st.success("Knowledge base created!")

    # Always try to load the vector DB
    vectordb = get_vectorstore()
    if not vectordb:
        st.warning("Knowledge base not found. Please click 'Create Knowledge Base' first.")
        return

    query = st.text_input("Ask your question:")
    if query:
        try:
            # Retrieve the top document
            docs = vectordb.similarity_search(query, k=1)
            if docs:
                st.write("**Answer:**", docs[0].page_content)
            else:
                st.write("I don't know.")
        except Exception as e:
            st.error(f"An error occurred while getting the answer: {e}")

if __name__ == "__main__":
    main()

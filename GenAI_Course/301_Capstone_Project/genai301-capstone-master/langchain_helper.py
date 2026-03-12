from langchain_community.vectorstores import FAISS
from langchain.document_loaders.csv_loader import CSVLoader
from langchain_community.embeddings import HuggingFaceEmbeddings

# Local HuggingFace embeddings
embedding_model = HuggingFaceEmbeddings(
    model_name=r"C:\Users\bhargav.veerabommala\GenAi_Course\genai301-capstone-master\distilbert-base-nli-mean-tokens"
)

vectordb_file_path = "faiss_index"

def create_vector_db():
    """Creates and saves the vector database from the CSV file."""
    loader = CSVLoader(file_path='ed-tech_faqs.csv', source_column="prompt")
    data = loader.load()

    texts = [doc.page_content for doc in data]

    vectordb = FAISS.from_texts(texts, embedding_model)

    vectordb.save_local(vectordb_file_path)
    print("Knowledge base created and saved.")

def get_vectorstore():
    """Load FAISS vectorstore."""
    try:
        vectordb = FAISS.load_local(
            vectordb_file_path,
            embedding_model,
            allow_dangerous_deserialization=True
        )
        return vectordb
    except Exception as e:
        print(f"An error occurred while loading the vectorstore: {e}")
        return None

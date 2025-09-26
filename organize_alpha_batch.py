import os

# Path to your "Alpha Batch" folder
root_folder = r"E:\mausam\Alpha Batch"  # <-- Change this to your folder path


# Function to delete all .class files recursively
def delete_class_files(folder):
    for dirpath, dirnames, filenames in os.walk(folder):
        for file in filenames:
            if file.endswith(".class"):
                file_path = os.path.join(dirpath, file)
                os.remove(file_path)
                print(f"Deleted: {file_path}")


# Run the function
delete_class_files(root_folder)
print("✅ All .class files have been deleted!")

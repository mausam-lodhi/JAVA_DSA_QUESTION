import os
import shutil

# Path to your "Alpha Batch" folder
root_folder = r"E:\mausam\Alpha Batch"  # <-- CHANGE this to your folder path

# Rules: keyword in filename -> folder name
rules = {
    "Array": "Arrays",
    "ArrList": "Arrays",
    "MultiDimensional": "Arrays",
    "SumIn2D": "Arrays",
    "SubArray": "Arrays",
    "SubArrays": "Arrays",
    "PairSum": "Arrays",
    "Largest": "Arrays",
    "NextGreator": "Arrays",
    "CountSubmatrices": "Arrays",
    "Pivot": "Arrays",
    "ProductExceptSelf": "Arrays",
    "MidOfSorted": "Arrays",
    "String": "Strings",
    "Palindrome": "Strings",
    "Compress": "Strings",
    "FirstNonRepeating": "Strings",
    "LongestSubstring": "Strings",
    "Frequency": "Strings",
    "Substring": "Strings",
    "RemoveDuplicates": "Strings",
    "Search": "SearchingSorting",
    "Binary": "SearchingSorting",
    "BubbleSort": "SearchingSorting",
    "MergeSort": "SearchingSorting",
    "QuickSort": "SearchingSorting",
    "SelectionSort": "SearchingSorting",
    "Sort": "SearchingSorting",
    "inbuiltSort": "SearchingSorting",
    "Recursion": "RecursionBacktracking",
    "Factorial": "RecursionBacktracking",
    "NQueens": "RecursionBacktracking",
    "FindSubsets": "RecursionBacktracking",
    "Permutation": "RecursionBacktracking",
    "Combination": "RecursionBacktracking",
    "ActivitySelection": "Greedy",
    "FractionalKnapsack": "Greedy",
    "JobSequencing": "Greedy",
    "MaximumLengthChains": "Greedy",
    "MinimumCoins": "Greedy",
    "MinimumAbsoluteDifference": "Greedy",
    "PricesOfStocks": "Greedy",
    "Queue": "QueueStack",
    "Stack": "QueueStack",
    "Deque": "QueueStack",
    "InterLeave": "QueueStack",
    "CicularQueue": "QueueStack",
    "LinkedList": "LinkedList",
    "IsLinkedLIstPalindrome": "LinkedList",
    "DoublyLinkedList": "LinkedList",
    "Power": "MathBitManipulation",
    "Prime": "MathBitManipulation",
    "Prim": "MathBitManipulation",
    "Bit": "MathBitManipulation",
    "Roman": "MathBitManipulation",
    "IntegerToRoman": "MathBitManipulation",
    "SetIth": "MathBitManipulation",
    "GetIth": "MathBitManipulation",
    "ClearIth": "MathBitManipulation",
    "RopesWithMinHeap": "MathBitManipulation",
    "Pattern": "Patterns",
    "Triangle": "Patterns",
    "Pyramid": "Patterns",
    "Diamond": "Patterns",
    "XPattern": "Patterns",
    "Floyd": "Patterns",
    "Square": "Patterns",
    "Stars": "Patterns",
    "Rhombus": "Patterns",
    "Concentric": "Patterns",
    "PrintX": "Patterns",
    "Matrix": "Matrix",
    "Spiral": "Matrix",
    "Transpose": "Matrix",
    "MaximumAreaInHistogram": "Matrix",
    "ContainersWithMostWater": "Matrix",
    "TrappingRainwater": "Matrix",
    "RateINAMaze": "Matrix",
    "Main": "Misc",
    "Practice": "Misc",
    "Question": "Misc",
    "Calculator": "Misc",
    "OOPS": "Misc",
    "Sudoku": "Misc",
    "Solution": "Misc",
    "TIlesProblem": "Misc",
    "Test": "Misc",
    "HashMap": "HashMap",
    "uniqueOccurrences": "HashMap",
}


# Function to organize only root files (ignores existing folders)
def organize_root_files(folder):
    for filename in os.listdir(folder):
        file_path = os.path.join(folder, filename)

        # Skip directories (existing folders)
        if os.path.isdir(file_path):
            continue

        moved = False
        for key, target_folder in rules.items():
            if key.lower() in filename.lower():
                folder_path = os.path.join(folder, target_folder)
                os.makedirs(folder_path, exist_ok=True)
                shutil.move(file_path, os.path.join(folder_path, filename))
                moved = True
                break

        # Move uncategorized files to Misc
        if not moved:
            misc_folder = os.path.join(folder, "Misc")
            os.makedirs(misc_folder, exist_ok=True)
            shutil.move(file_path, os.path.join(misc_folder, filename))


# Run the organization
organize_root_files(root_folder)
print("✅ All root files have been organized into proper folders!")

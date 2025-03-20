# Day_01

## Code Overview

### 1. **One.java**
- Q1: Printing "Hello World".
- Q2: Printing numbers from 1 to 10.
- Q3: Printing numbers from 10 to 1 (in reverse order).
- Q4: Printing odd numbers from 1 to 20.
- Q5: Reverse the left and right numbers 

### 2. **StudentAverage.java**
- Creating a `Student` class with attributes (`name` and `marks`).
- Calculating the average marks of a group of students.

### 3. **Library.java**
- Creating a `Book` class with attributes (`title` and `author`).
- Extending the `Book` class to create `PrintedBook`, `EBook`, and `AudioBook` subclasses.
- Displaying details of different types of books.

### 4. **RetailStore.java**
- Creating a `Product` class with attributes (`name`, `price`, and `quantity`).
- Managing a list of products in a retail store.
- Providing a menu to add, edit, delete, and display products.

## Expected Output

### Output for `One.java`
When you run `One.java`, the output will be as follows:

#### Q1: Hello World
```
Hello World...
```

#### Q2: Numbers from 1 to 10
```
1
2
3
4
5
6
7
8
9
10
```

#### Q3: Numbers from 10 to 1 (Reverse Order)
```
10
9
8
7
6
5
4
3
2
1
```

#### Q4: Odd Numbers from 1 to 20
```
1
3
5
7
9
11
13
15
17
19
```
### Q5: Reverse the left and right numbers
```
Enter number: 
9
4 3 2 1 5 9 8 7 6
```
---
### Output for `StudentAverage.java`
When you run `StudentAverage.java`, the output will be as follows:
```
Average marks: 86.6
```
---
### Output for `Library.java`
When you run `Library.java`, the output will be as follows:
```
Library Book Details:
Title: A
Author: A. ABC
Pages: 218
----------------------------
Title: B
Author: B. BCD
File Size: 1.5 MB
----------------------------
Title: C
Author: CDE
Duration: 19.2 hours
----------------------------
```
---
### Output for `RetailStore.java`
When you run `RetailStore.java`, the program will display a menu:
```
--- Retail Store Menu ---
1. Add Product
2. Edit Product
3. Delete Product
4. Display Products
5. Exit
Choose an option:
```
- If you choose **1 (Add Product)**, the program will prompt you to enter the product's name, price, and quantity. After adding, it will display:
```
Product added successfully!
```
- If you choose **2 (Edit Product)**, the program will prompt you to enter the product's name and then update its price and quantity. After editing, it will display:
```
Product added successfully!
```
- If you choose **3 (Delete Product)**, the program will prompt you to enter the product's name and then delete it. After deletion, it will display:
```
Product deleted successfully!
```
- If you choose **4 (Display Products)**, the program will display all available products in the following format:
```
Available Products:
Name: [Product Name], Price: [Price], Quantity: [Quantity]
```
- If you choose **5 (Exit)**, the program will terminate with the message:
```
Exiting program. Goodbye!
```
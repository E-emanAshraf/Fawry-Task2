# *📚 Book Inventory Management System*
This is a simple Java-based object-oriented application for managing a bookstore inventory. It supports adding, removing, and purchasing books of different types (PaperBook, EBook, DemoBook), and removing outdated books based on their publication year.

## *✅ Features*
- Add books to inventory (Paper, EBook, Demo).

- Remove books manually or based on age.

- Handle purchase operations for:

   📦 PaperBooks: quantity-based and shipped to address.

   📧 EBooks: emailed to user.

   ❌ DemoBooks: not for sale.

- Display formal system messages for user interactions.

## *🏗️ Class Overview*

- Inventory : Manages the collection of books using a HashMap
- Book : Abstract base class for all book types
- PaperBook	: Extends Book, includes quantity, and supports shipping
- EBook	: Extends Book, supports email delivery
- DemoBook : Extends Book, not purchasable
- Main :	Demonstrates adding, buying, and removing books

## *📦 Example Output*

=== Buying Paper Book ===
Paid amount: 100.0
The paper book is included in the shipping service. Please send it to the following customer address: Shoubra Masr
Book{ISBN='1002', title='C++ basics', published_year=2025, price=50.0}

=== Buying eBook ===
Paid amount: 30.0
The EBook is included in the mail service. Please send it to the following email address: emy@gmail.com
Book{ISBN='1003', title='OOP', published_year=2019, price=30.0}

=== Trying to buy demo book ===
This book is a demo copy and is not available for sale.

=== Removing outdated books (older than 4 years) ===
Removed outdated book: MySQL
Removed outdated book: OOP

=== Removing a book manually ===
Removed: C++ basics




#📚 Book Inventory Management System
This is a simple Java-based object-oriented application for managing a bookstore inventory. It supports adding, removing, and purchasing books of different types (PaperBook, EBook, DemoBook), and removing outdated books based on their publication year.

##✅ Features
Add books to inventory (Paper, EBook, Demo).

Remove books manually or based on age.

Handle purchase operations for:

📦 PaperBooks: quantity-based and shipped to address.

📧 EBooks: emailed to user.

❌ DemoBooks: not for sale.

Display formal system messages for user interactions.

🏗️ Class Overview
Class	Description
Inventory	Manages the collection of books using a HashMap
Book	Abstract base class for all book types
PaperBook	Extends Book, includes quantity, and supports shipping
EBook	Extends Book, supports email delivery
DemoBook	Extends Book, not purchasable
InventoryTest	Demonstrates adding, buying, and removing books

🚀 How to Run

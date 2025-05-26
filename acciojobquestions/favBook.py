# class FavouriteBook:
#     def __init__(self, title, author, publisher):
#         self.title = title
#         self.author = author
#         self.publisher = publisher

#     def add(self, books):
#         if len(books) < 10:
#             books.append(self)
#         else:
#             print("Error: Cannot add more than 10 books.")

#     def remove(self, books):
#         if self in books:
#             books.remove(self)
#         else:
#             print("Error: Book not found in list.")

class Book:
    def __init__(self, title, author, publisher):
        self.title = title
        self.author = author
        self.publisher = publisher

class FavoriteBook(Book):
    def __init__(self, title, author, publisher):
        super().__init__(title, author, publisher)
        self.sharedWith = []

    def addFriend(self, friend):
        if friend in self.sharedWith:
            print(f"{friend} is already in the shared list.")
        elif len(self.sharedWith) < 10:
            self.sharedWith.append(friend)
            print(f"{friend} added successfully.")
        else:
            print("Cannot add more than 10 friends.")

    def removeFriend(self, friend):
        if friend in self.sharedWith:
            self.sharedWith.remove(friend)
            print(f"{friend} removed successfully.")
        else:
            print(f"{friend} not found in the shared list.")

    def displaySharedWith(self):
        print("Shared with:", self.sharedWith)

    def __str__(self):
        return self.title+" "+self.author+" "+self.publisher    

book = FavoriteBook("1984", "George Orwell", "Secker & Warburg")

book.addFriend("Alice")
book.addFriend("Bob")
book.addFriend("Charlie")

book.displaySharedWith()
# Output: Shared with: ['Alice', 'Bob', 'Charlie']

book.removeFriend("Bob")

print(book)
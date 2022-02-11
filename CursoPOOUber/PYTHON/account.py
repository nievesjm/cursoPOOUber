import string
from tkinter.tix import INTEGER

class Account:
    id: int
    name:string
    document: string
    email: string
    password:string
    def __init__(self, name, document):
        self.name= name
        self.document=document
package web

import geb.*

class ToDoHomepage extends Page {
    static url = "http://localhost:8080/todo"
    static at = { title == "To Do application" }
}
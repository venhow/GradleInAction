package web

import geb.*

class ToDoInsert extends Page {
    static url = "http://localhost:8080/todo/insert"
    static at = { title == "To Do application" }
}
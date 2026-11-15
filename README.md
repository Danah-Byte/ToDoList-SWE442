# To-Do List (Java)

A simple command-line To-Do List application written in Java.
Built for **SWE 442 - Software Configuration Management** to practice Git and GitHub:
branching, pull requests, merge conflict resolution, tags and release notes.

## Features

- **Add Task** - add a new task to the list
- **View Tasks** - show all tasks with their numbers
- **Delete Task** - delete a task by its number, with validation and error messages (v1.1)
- **Exit** - close the program

## Requirements

- Java JDK 8 or newer
- NetBeans (optional, the project was created with it)

## How to run

```bash
git clone https://github.com/Danah-Byte/ToDoList-SWE442.git
cd ToDoList-SWE442/src
javac todolist/ToDoList.java
java todolist.ToDoList
```

Or open the project folder in NetBeans and press **Run**.

## Example

```
===== MY TO-DO LIST =====
1. Add Task
2. View Tasks
3. Delete Task
4. Exit
Enter your choice:
```

## Git workflow

- `master` holds the stable code.
- Each feature is developed on its own branch and merged with a Pull Request:
  - `feature/delete-task` - delete task feature (PR #1)
  - `feature/complete-task` - menu title update (PR #2, merge conflict resolved)
- Releases are tagged `v1.0` and `v1.1`. See [RELEASE_NOTES.md](RELEASE_NOTES.md).

## Author

Danah Abdulaziz AL-Ghutayghit - ID 451205638

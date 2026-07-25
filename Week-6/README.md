# Week-6: Git Version Control

## Overview

This week covers Git fundamentals and advanced Git operations.

Topics covered:

- Git installation and configuration
- Git repository creation
- Git commands (init, status, add, commit, push, pull)
- Git editor configuration using Notepad++
- Git Ignore
- Branching and merging
- Merge conflict resolution
- Cleaning repository and synchronizing with remote repository


---

# Hands-on 1: Git Setup and Basic Git Commands

## Objectives

- Familiarize with Git commands like:
  - git init
  - git status
  - git add
  - git commit
  - git push
  - git pull

- Setup machine with Git configuration
- Integrate Notepad++ as default Git editor
- Add files to source code repository


## Step 1: Git Configuration

### Check Git Installation

```bash
git --version
```

### Configure User Name

```bash
git config --global user.name "Your Name"
```

### Configure Email

```bash
git config --global user.email "your-email@example.com"
```

### Verify Configuration

```bash
git config --list
```


---

## Step 2: Configure Notepad++ as Git Editor

### Check Notepad++ from Git Bash

```bash
notepad++
```

### Create Alias for Notepad++

```bash
alias npp='notepad++.exe -multiInst -nosession'
```

### Configure Git Default Editor

```bash
git config --global core.editor "notepad++.exe -multiInst -nosession"
```

### Verify Editor Configuration

```bash
git config --global -e
```


---

## Step 3: Create Git Repository

### Create Project Folder

```bash
mkdir GitDemo
```

### Navigate into Repository

```bash
cd GitDemo
```

### Initialize Git Repository

```bash
git init
```

### Check Repository Status

```bash
git status
```


---

## Add File to Repository

### Create File

```bash
touch welcome.txt
```

### Check File

```bash
ls
```

### View File Content

```bash
cat welcome.txt
```


### Add File to Staging Area

```bash
git add welcome.txt
```


### Commit Changes

```bash
git commit -m "Added welcome.txt file"
```


---

## Remote Repository Operations

### Add Remote Repository

```bash
git remote add origin <repository-url>
```


### Pull Remote Repository

```bash
git pull origin master
```


### Push Changes to Remote Repository

```bash
git push origin master
```



---

# Hands-on 2: Git Ignore

## Objectives

- Understand Git Ignore
- Ignore unwanted files and folders


## Create Log File and Folder

Create log file:

```bash
touch sample.log
```

Create log folder:

```bash
mkdir log
```


## Create .gitignore File

```bash
touch .gitignore
```


## Add Ignore Rules

Add the following content:

```
*.log
log/
```


## Check Status

```bash
git status
```


Git will ignore:

- All files with `.log` extension
- log folders


## Add .gitignore

```bash
git add .gitignore
```


## Commit Changes

```bash
git commit -m "Added gitignore for unwanted files"
```



---

# Hands-on 3: Git Branching and Merging

## Objectives

- Understand Git branching
- Create branches
- Merge branches with master


## Create New Branch

```bash
git branch GitNewBranch
```


## List Branches

Local branches:

```bash
git branch
```


Local and remote branches:

```bash
git branch -a
```


## Switch to Branch

```bash
git checkout GitNewBranch
```


## Add Files in Branch

Create file:

```bash
touch branchfile.txt
```


Add file:

```bash
git add branchfile.txt
```


Commit changes:

```bash
git commit -m "Added changes in GitNewBranch"
```


## Check Status

```bash
git status
```


---

## Merge Branch


Switch to master:

```bash
git checkout master
```


Compare differences:

```bash
git diff master GitNewBranch
```


Visual comparison using P4Merge:

```bash
git difftool master GitNewBranch
```


Merge branch:

```bash
git merge GitNewBranch
```


View merge history:

```bash
git log --oneline --graph --decorate
```


Delete branch:

```bash
git branch -d GitNewBranch
```



---

# Hands-on 4: Merge Conflict Resolution

## Objectives

- Understand merge conflicts
- Resolve conflicts during merging


## Verify Master Status

```bash
git status
```


## Create Branch

```bash
git branch GitWork
```


Switch branch:

```bash
git checkout GitWork
```


## Create hello.xml

```bash
touch hello.xml
```


Modify file and commit:

```bash
git add hello.xml
```

```bash
git commit -m "Updated hello.xml in GitWork branch"
```


---

## Switch to Master

```bash
git checkout master
```


Create same file:

```bash
touch hello.xml
```


Add different content and commit:

```bash
git add hello.xml
```

```bash
git commit -m "Added hello.xml in master branch"
```


---

## View Branch History

```bash
git log --oneline --graph --decorate --all
```


## Compare Differences

```bash
git diff master GitWork
```


## Merge Branch

```bash
git merge GitWork
```


A merge conflict occurs because both branches modified the same file.


---

## Resolve Conflict

Open file:

```bash
notepad hello.xml
```


Remove conflict markers:

```
<<<<<<< HEAD
Master changes
=======
GitWork changes
>>>>>>> GitWork
```


After resolving:

```bash
git add hello.xml
```


Commit:

```bash
git commit -m "Resolved merge conflict between master and GitWork"
```


---

## Add Backup Files to Git Ignore

Create/update:

```bash
touch .gitignore
```


Add:

```
*.orig
```


Commit:

```bash
git add .gitignore
```


```bash
git commit -m "Added backup files to gitignore"
```


## List Branches

```bash
git branch -a
```


## Delete Merged Branch

```bash
git branch -d GitWork
```


## View Final History

```bash
git log --oneline --graph --decorate
```



---

# Hands-on 5: Cleanup and Push Back to Remote Git

## Objectives

- Clean up Git repository
- Push changes back to remote repository


## Verify Master Status

```bash
git checkout master
```


```bash
git status
```


Expected:

```
nothing to commit, working tree clean
```


---

## List Available Branches

```bash
git branch -a
```


---

## Pull Remote Repository

```bash
git pull origin master
```


---

## Check Pending Commits

```bash
git log --oneline
```


---

## Push Changes to Remote Repository

```bash
git push origin master
```


---

## Verify Synchronization

```bash
git status
```


Expected output:

```
Your branch is up to date with 'origin/master'.

nothing to commit, working tree clean
```



---

# Git Command Quick Reference

| Command | Purpose |
|---------|---------|
| git --version | Check Git version |
| git config | Configure Git settings |
| git init | Initialize repository |
| git clone | Clone repository |
| git status | Check repository status |
| git add | Add files to staging |
| git commit | Commit changes |
| git log | View history |
| git branch | Manage branches |
| git checkout | Switch branches |
| git merge | Merge branches |
| git diff | Compare changes |
| git pull | Pull remote changes |
| git push | Push changes |
| git remote -v | View remote repository |
| git branch -d | Delete branch |


---

# Week-6 Completion Summary

Completed Hands-ons:

✅ Hands-on 1: Git Setup and Basic Commands  
✅ Hands-on 2: Git Ignore  
✅ Hands-on 3: Branching and Merging  
✅ Hands-on 4: Merge Conflict Resolution  
✅ Hands-on 5: Cleanup and Push Back to Remote Git  

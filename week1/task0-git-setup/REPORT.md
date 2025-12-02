# Task 0: Git Setup

## Time Spent: ~ 1.5 hours

### What is Git and GitHub
Git is a version control system - a software that is installed locally on the developer's machine and it's used to track code changes.

GitHub is a SaaS, hosted on the web and it's used by developers to store repositories, track, share, and contribute to a code base together.

Repository:
Storage space where the code lives, it holds all files created by the developer or contributed by other developers, alongside with history of changes and commits. It can be local (Git) and remote (GitHub).
All changes made in the code can be staged by the command git add ., as well as separate files if needed (git add file_name). All added files with the previous command can be commited to the local repository with the command git commit -m "message explaining what has been done or changed". It is important the messages to be clear so other developers or people checking the code can understand what's been done/changed.
Once the commit is done, we can send all of commited files into the remote repository with the command git push -u origin/master(or sometimes main, depending on the team's setup and naming). The git push command creates a merge request, which is usually reviewed by a senior developer before approval.
If we want our local repository to be up-to-date with all the changes made by other developers in the remote repository, we execute the command git pull.


## Main Commands I Used
| Command | What It Does |
| git clone | Clones the remote repository with all its files to my machine
| git add . | Stages all the changed (in my case newly created) files to be committed to the local repository |
| cd java-fundamentals | Changes the current directory to the java-fundamentals folder |
| git commit -m "task0: initial repository setup" | Commits all staged files (from gid add .)to the local repository
| git push -u origin/main | Pushes all committed files to the remote repository on GitHub |

## What is README.md
README.md is a high-level description file of the project, it includes information about the project itself and the used frameworks. The file contains information on how to set up the environment needed for the project as well as key details for configuration, such as scripts etc.

## What Was Confusing / Difficult
Probably the most difficult part was to explain the difference between Git and GitHub, as they are closely related but serve different purposes.

## Sources
https://www.geeksforgeeks.org/git/difference-between-git-and-github/

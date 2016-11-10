# SpaceX
A Java space game application

## Helloooooo team members! :dog: :smile: :rocket:
Here's how you get started: 
  1. Create a new Java project titled SpaceX
  2. git clone the git repo to wherever you would like - you can do this by running this command 
  __git clone git@github.com:Zachary-Diemer21/SpaceX.git__
  - You do not have to initialize a new repo, cloning it will do all of the work for you. ALSO if you want to be efficient, use the cd command to change to your Eclipse Java workspace folder and clone the repo inside of that workspace, this way every time you save the changes to these files you will be able to push from this location. :smile: Tis Highly recommended!!!
  3. Created a new package titled game in this new project 
  4. GIT Overview: There are only two branches: 
    * The dev branch 
    * The master branch 
    So the way branches work: 
    * to find out how many branches there are after you clone the repo type the command __git branch__ 
    * __IF YOU ARE MISSING A BRANCH DO NOT FRET__ just type the command __git pull origin branchname__ (may need to add -u in front of origin) (should use git branch again to make sure which branch you are on, and that you have successfully pulled the branch) - additionally you should switch to the newly pulled branch, and type the ls command to make sure the updated contents are on said branch
    * to create a new branch, utilize the command __git branch newbranchname__. __WHEN CREATING A NEW BRANCH, MAKE SURE YOU ARE ON THE DEV BRANCH__. This will create a copy of the dev branch and basically change the name from dev to the new name you gave the branch 
    * We will be utilizing two types of naming conventions when creating new branches: feature-featurename and hotfix-hotfixname. A reminder, ALWAYS MAKE SURE YOU ARE ON THE DEV BRANCH BEFORE CREATING A NEW BRANCH. The command __git checkout branchname__ will switch you from a specific branch to another. 
    
    Creating a new Branch:
    * __ git branch newbranchname__ - only creates the branch locally, to push your new branch and all of its changes to the remote repo on github you must use 
    1. __git status__ to see the changes you made
    2. __git add filenamesdisplayedbygitstatus__ - if you delete something google how to push such changes appropriately
    3. __git commit -m "description of commit goes here"__ :smile:
    4. __git push -u origin branchname__ (If you just want to push the newly created branch to github you only have to use this command)
    
    Merging a Branch:
    * Create a new branch
    1. __git branch newhotfixorfeaturebranchname__
    2. __git checkout newhotfixorfeaturebranchname__
    3. __git status__ 
    4. __git add filenamesthatneedtobeadded__
    5. __git commit -m "description of commit here"__
    6. __git push -u origin newhotfixorfeaturebranchname__
    * Begin Merge Portion
    7. __git checkout dev__ (or the branch you would like to merge the new branch too) 
    8. __git pull origin dev__ (or the branch you would like to merge the new branch - to make sure your branch is up to date)
    9. __git merge newhotfixorfeaturebranchname__
    10.__git branch__ (to see what branches are left and to see if the merge worked)
    11.__ls__ 
    12.__git push -u origin dev__ (or the branch you would like to merge the new branch too) - __ONLY DO THIS IF YOU ARE SURE ABOUT THE MERGE YOU HAVE JUST CONDUCTED, THIS WILL PUSH ALL CHANGES TO THE REPO__
    
    Deleting a branch locally and on the Repo:
    1. First do __git branch__ and see what branches there are and which one you are on
    2. __git checkout diffbranchname__ to make sure you are not on that branch 
    3. __git branch -d branchnameyouwantdeleted__ 
    4. This command deletes the branch on Github - __git push --delete branchnameyouwantdeleted__ __NEVER EVER, EVER DELETE THE DEV BRANCH, OR MAY THE WRATH OF THOR :hammer: BE BROUGHT UPON YOU__
    
    

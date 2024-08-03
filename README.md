# Time Remider Application Setup Guide

## Overview

This guide outlines the steps to compile a Java application, package it into a JAR file, optionally wrap it into an executable, and configure it to start automatically on Windows.

## 1. Compile Your Java Application

Ensure you have your Java source file (`Log.java`).

**Compile the Java code:**

```
javac Log.java
```

**Create a Manifest file**
```
file name : "manifest.txt"
```
inside the manifest file 
```
Main-Class: Log
```

**Package the JAR File**

```
jar cfm Log.jar manifest.txt Log.class
```

## 2. Create an Executable (exe file for windows)

**Download and Install Launch4j**

```
https://launch4j.sourceforge.net/
```

**Configure Launch4j**
```
https://www.youtube.com/watch?v=e3S3BOvpWic
```
```
1.Open Launch4j and create a new configuration.
2.Set the output file path and name (e.g., C:\path\to\LogApp.exe).
3.Specify the JAR file and the main class (com.example.Log).
4.uild the executable.
```

## 3. Add Your Application to Startup (Windows)

**Create a Shortcut**

```
Right-click on the executable or JAR file.
Select Create shortcut.
```

**Add the Shortcut to the Startup Folder**

```
Press Win + R, type shell:startup, and press Enter to open the Startup folder.
Move or copy the shortcut into the Startup folder.
```

**Check Task Manager**

```
Open Task Manager (Ctrl + Shift + Esc) and review the Startup tab to ensure your application is listed.
```

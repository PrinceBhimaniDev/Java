# Java Setup Guide for Mac 🍎

## Step 1: Check if Java is Already Installed

Open Terminal and run:
```bash
java -version
javac -version
```

If you see version output, you already have Java. Skip to Step 3 if version is 11+.

---

## Step 2: Install Java JDK 17 (Latest LTS)

### Option A: Using Homebrew (Recommended - Easy)

1. **Install Homebrew** (if not already installed):
```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

2. **Install Java 17 LTS**:
```bash
brew install openjdk@17
```

3. **Create symbolic link** (so `java` command works):
```bash
sudo ln -sfn /usr/local/opt/openjdk@17/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-17.jdk
```

4. **Verify installation**:
```bash
java -version
javac -version
```

### Option B: Download from Oracle (Manual)

1. Go to: https://www.oracle.com/java/technologies/downloads/#java17
2. Download macOS Installer (ARM64 for M1/M2/M3 Macs, x64 for Intel)
3. Run the installer
4. Follow on-screen instructions

---

## Step 3: Set JAVA_HOME Environment Variable

This is important for Maven and other tools.

1. **Find Java location**:
```bash
/usr/libexec/java_home -v 17
```

You'll see output like: `/Library/Java/JavaVirtualMachines/openjdk-17.jdk/Contents/Home`

2. **Open Terminal profile**:
```bash
nano ~/.zshrc
```
(Use `~/.bash_profile` if you're on older Mac with bash)

3. **Add these lines at the end**:
```bash
export JAVA_HOME=$(/usr/libexec/java_home -v 17)
export PATH="$JAVA_HOME/bin:$PATH"
```

4. **Save and exit**: Press `Ctrl+O`, then `Enter`, then `Ctrl+X`

5. **Apply changes**:
```bash
source ~/.zshrc
```

6. **Verify**:
```bash
echo $JAVA_HOME
java -version
```

---

## Step 4: Install IDE - IntelliJ IDEA Community Edition

### Option A: Using Homebrew (Easiest)
```bash
brew install --cask intellij-idea-ce
```

### Option B: Manual Download
1. Go to: https://www.jetbrains.com/idea/download/
2. Download Community Edition for Mac
3. Drag to Applications folder
4. Launch from Applications

### First Time Setup in IntelliJ:
1. Open IntelliJ IDEA
2. Skip initial configuration (or import settings if needed)
3. Create New Project → Java
4. Select Project SDK: Choose your Java 17 installation
5. Click Create

---

## Step 5: Install Maven (Optional but Recommended)

Maven helps manage Java projects and dependencies.

```bash
brew install maven
```

Verify:
```bash
mvn -version
```

---

## Step 6: Create Your First Java Project

### In IntelliJ IDEA:

1. **File → New → Project**
2. **Select "Java"** from left panel
3. **Project name**: `JavaLearning`
4. **Project location**: Anywhere on your Mac
5. **Create**

### Create Your First Class:

1. Right-click on `src` → New → Java Class
2. Name: `HelloWorld`
3. IntelliJ auto-generates:
```java
public class HelloWorld {
}
```

4. Add main method:
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

5. Click green play button or press `Control + R`
6. You should see: `Hello, Java!`

**Congratulations! Java is set up! 🎉**

---

## Step 7: Quick Keyboard Shortcuts for Mac (IntelliJ)

| Action | Shortcut |
|--------|----------|
| Run Program | `Control + R` |
| Run with Debugger | `Control + D` |
| Format Code | `Option + Command + L` |
| Auto-complete | `Control + Space` |
| Find Usage | `Option + F7` |
| Go to Definition | `Command + B` |
| Quick Documentation | `F1` |
| Terminal | `Option + F12` |

---

## Step 8: Recommended Tools & Extensions

### IntelliJ Extensions (Settings → Plugins):
- **SonarLint**: Code quality checks
- **Lombok**: Reduce boilerplate code
- **Rainbow Brackets**: Color-coded brackets
- **GitToolbox**: Git integration

### Terminal Tools:
```bash
# Git (version control)
brew install git

# Tree (view folder structure)
brew install tree

# jq (JSON processing - useful later)
brew install jq
```

---

## Step 9: Troubleshooting

### Problem: `java: command not found`
**Solution**:
```bash
# Check if Java is really installed
ls /Library/Java/JavaVirtualMachines/

# Manually set JAVA_HOME
export JAVA_HOME=$(/usr/libexec/java_home -v 17)
```

### Problem: IntelliJ shows "No JDK configured"
**Solution**:
1. IntelliJ → Settings → Project Structure → Project
2. Click "Add SDK" → "Add JDK"
3. Navigate to: `/Library/Java/JavaVirtualMachines/openjdk-17.jdk/Contents/Home`

### Problem: Maven not found
**Solution**:
```bash
# Reinstall Maven
brew reinstall maven

# Set MAVEN_HOME in ~/.zshrc
export MAVEN_HOME=/usr/local/opt/maven
export PATH="$MAVEN_HOME/bin:$PATH"

source ~/.zshrc
```

---

## What's Next?

✅ Java installed  
✅ IDE ready  
✅ Your first program running  

Now move to: **2_Java_Fundamentals_Content.md**

---

## Useful Resources

- **Java Documentation**: https://docs.oracle.com/javase/17/docs/
- **IntelliJ Help**: https://www.jetbrains.com/help/idea/
- **Homebrew**: https://brew.sh/
- **Terminal Tips for Mac**: https://www.makeuseof.com/mac-terminal-commands/

**Time spent on setup: ~15-20 minutes ⏱️**

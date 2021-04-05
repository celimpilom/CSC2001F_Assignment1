
JAVAC=/usr/bin/javac
.SUFFIXES: .java .class
SRCDIR=src
BINDIR=bin
FILESDIR=files

$(BINDIR)/%.class:$(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<
	
CLASSES=ReadFile.class AccessArrayApp.class BinaryTreeNode.class BTQueueNode.class BTQueue.class  BinaryTree.class \
BinarySearchTree.class

CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)

default: $(CLASS_FILES)

run:
	java -cp bin AccessArrayApp $(stdN)
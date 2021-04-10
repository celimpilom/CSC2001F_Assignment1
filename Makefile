
JAVAC=/usr/bin/javac
.SUFFIXES: .java .class
SRCDIR=src
BINDIR=bin
FILESDIR=files

$(BINDIR)/%.class:$(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<
	
CLASSES=ReadFile.class AccessArrayApp.class BinaryTreeNode.class BTQueueNode.class BTQueue.class  BinaryTree.class \
BinarySearchTree.class AccessBSTApp.class

CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)

default: $(CLASS_FILES)

docs:
	javadoc -d doc/ src/*.java

runarray:
	java -cp bin AccessArrayApp $(stdN)
runbst:
	java -cp bin AccessBSTApp $(stdN)
runtest:
	python3 script/test.py
cleantest:
	rm files/data/*
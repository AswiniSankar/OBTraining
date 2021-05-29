package com.corejava.assignments.day9.collections;

import java.util.Comparator;

class Books implements Comparator<Books> {  
int id;  
String name,author;  

public Books(int id, String name, String author) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    
  
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

@Override
public String toString() {
	return "Books [id=" + id + ", name=" + name + ", author=" + author + "]";
}

@Override
public int compare(Books o1, Books o2) {
     
	return o1.name.compareTo(o2.name);
}  

}  
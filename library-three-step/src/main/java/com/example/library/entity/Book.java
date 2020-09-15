package com.example.library.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="book")
@Getter //Lombok erstellt automatisch Geter und Setter Funktionen
@Setter //Vorteil bei änderungen, bei den Feldern muss nicht jede Methode angepasst werden
@NoArgsConstructor //erstellt einen leeren Konstruktor
@ToString // genieriert  toString mit allen Felder
@EqualsAndHashCode
public class Book {
	/*
	 * mit Lombok können wir equalse(), toString(), hashCode() automatisieren 
	 */
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String author;
	private String isbn;
	
	public Book(String title, String author,String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		
	}
	
}

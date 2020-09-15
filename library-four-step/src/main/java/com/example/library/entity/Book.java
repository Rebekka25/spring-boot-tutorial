package com.example.library.entity;
//Seit Java8 neu, ist die bessere Wahl
import java.time.LocalDate;
//import java.util.Date; nicht nehmen ist veraltet

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
	private LocalDate publishingYear;
	
	public Book(String title, String author,String isbn, LocalDate publishingYear) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.publishingYear = publishingYear;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public LocalDate getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(LocalDate publishingYear) {
		this.publishingYear = publishingYear;
	}
	
}

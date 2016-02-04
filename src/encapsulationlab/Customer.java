/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationlab;

/**
 *
 * @author Tim
 */
public class Customer {
    private String genre;
    private char rating;
    private String gameName;
    public Customer() {
        genre = "action";
        rating = 'M';
        gameName= "Call of Duty";
    }
    
    public void OrderGame(){
        Company a = new Company();
        a.makeGame(genre, rating, rating);
    }
    
    public String getGameName() {
        return gameName;
    }

    public void setGameName(String Name) {
        this.gameName = Name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public char getRating() {
        return rating;
    }

    public void setRating(char rating) {
        this.rating = rating;
    }
    
}

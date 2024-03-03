package co.develhope.esercizio2.interceptor.Entities;

import jakarta.persistence.*;

@Entity
@Table
public class Month {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private int monthNumber;
    @Column
    private String englishName;
    @Column
    private String italianName;
    @Column
    private String germanName;

    public Month(Long id, int monthNumber, String englishName, String italianName, String germanName) {
        this.id = id;
        this.monthNumber = monthNumber;
        this.englishName = englishName;
        this.italianName = italianName;
        this.germanName = germanName;
    }

    public Month() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getItalianName() {
        return italianName;
    }

    public void setItalianName(String italianName) {
        this.italianName = italianName;
    }

    public String getGermanName() {
        return germanName;
    }

    public void setGermanName(String germanName) {
        this.germanName = germanName;
    }

    @Override
    public String toString() {
        return "Month{" +
                "id=" + id +
                ", monthNumber=" + monthNumber +
                ", englishName='" + englishName + '\'' +
                ", italianName='" + italianName + '\'' +
                ", germanName='" + germanName + '\'' +
                '}';
    }
}

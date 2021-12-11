package org.zup.paulo.gercomics.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name="comic")
public class Comic implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long ComicId;

    @NotBlank(message = "Titulo é obrigatorio")
    private String título;

    @NotBlank(message = "Autores é obrigatorio")
    private String autores;

    @NotNull(message = "Preço é obrigatorio")
    private BigDecimal preco;

    private String descricao;

    @NotNull(message = "Preço é obrigatorio")
    private String isbn;

    public Long getComicId() {

        return ComicId;
    }

    public void setComicId(Long comicId) {
        ComicId = comicId;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comic comic = (Comic) o;
        return getComicId().equals(comic.getComicId()) && getTítulo().equals(comic.getTítulo()) && getIsbn().equals(comic.getIsbn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getComicId(), getTítulo(), getIsbn());
    }

    @Override
    public String toString() {
        return "Comic{" +
                "ComicId=" + ComicId +
                ", título='" + título + '\'' +
                ", autores='" + autores + '\'' +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", isbn=" + isbn +
                '}';
    }
}

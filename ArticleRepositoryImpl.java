package data.repositories;

import data.models.Article;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepositoryImpl implements ArticleRepository{
    private int count;
    private List<Article> articles = new ArrayList<>();


    @Override
    public Article save(Article article) {
        if(article.getId()== 0){
        article.setId(count +1);
        articles.add(article);
        count++;}
        return article;
    }

    @Override
    public Article findById(int id) {
        for(Article article : articles) if (article.getId() == id) return article;

        return null;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public List<Article> findAll() {
        return articles;
    }

    @Override
    public void delete(Article article) {
        for(Article post : articles){
            if (post == article) {
                articles.remove(article);
                break;
            }}
        count--;
    }

    @Override
    public void delete(int id) {
        for(Article article : articles) {
            if (article.getId() == id){
                articles.remove(article);
                break;}}
            count--;
    }

    @Override
    public void deleteAll() {
    articles.clear();
    count=0;
    }

    @Override
    public List<Article> findByAuthorId(int authorId) {
        List<Article> list = new ArrayList<>();
        for(Article article : articles) {
            if (article.getAuthorId() == authorId){
                list.add(article);
            }
        }

        return list;
    }
}

package data.repositories;

import data.models.Article;
import data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArticleRepositoryImplTest {

    private ArticleRepository articleRepository;
    private Article article;

    @BeforeEach
    public void setUp() {
        articleRepository = new ArticleRepositoryImpl();
        article = new Article();
        article.setAuthorId(1);
        article.setBody("The winner of the 2023 presidential election is Peter Obi");
        article.setTitle("And the winner is");
    }

    @Test
    public void saveOneArticle_countIsOneTest() {
        articleRepository.save(article);
        assertEquals(1, articleRepository.count());
    }

    @Test
    public void saveOneArticle_idOfUserIsOneTest() {
        Article savedArticle = articleRepository.save(article);
        assertEquals(1, savedArticle.getId());
    }


    @Test
    @DisplayName("Update Article test")
    public void saveTwoArticlesWithSameId_countIsOneTest() {
        Article savedArticle = articleRepository.save(article);
        assertEquals(1, articleRepository.count());
        savedArticle.setTitle("New President: PETER OBI");
        articleRepository.save(savedArticle);
        assertEquals(1, articleRepository.count());

    }

    @Test
    public void saveOneArticle_findArticleByIdTest() {
        Article savedArticle = articleRepository.save(article);
        assertEquals(1, savedArticle.getId());
        Article foundArticle = articleRepository.findById(1);
        assertEquals(foundArticle, savedArticle);
    }

    @Test
    public void saveOneArticle_deleteOneArticleTest() {
        articleRepository.save(article);
        assertEquals(1, articleRepository.count());
        articleRepository.delete(article);
        assertEquals(0, articleRepository.count());
    }

    @Test
    public void saveOneArticle_deleteById_countIsZeroTest() {
        articleRepository.save(article);
        assertEquals(1, articleRepository.count());
        articleRepository.delete(1);
        assertEquals(0, articleRepository.count());
    }

    @Test
    public void saveThreeArticles_findThreeArticle_countIsThreeTest() {
        articleRepository.save(article);
        Article article1 = new Article();
        Article article2 = new Article();
        articleRepository.save(article1);
        articleRepository.save(article2);
        assertEquals(3, articleRepository.count());
        List<Article> list;
        list = articleRepository.findAll();
        assertEquals(3, list.size());
        assertTrue(list.contains(article));
        assertTrue(list.contains(article1));
        assertTrue(list.contains(article2));
    }

    @Test
    public void saveThreeUsers_deleteAll_countIsZeroTest() {
        articleRepository.save(article);
        Article article1 = new Article();
        Article article2 = new Article();
        articleRepository.save(article1);
        articleRepository.save(article2);
        articleRepository.deleteAll();
        assertEquals(0, articleRepository.count());
    }

    @Test
    public void saveTwoOfThreeArticlesWithAuthorId2_findTwoArticleWithAuthorId2_countIsTwoTest() {
        articleRepository.save(article);
        Article article1 = new Article();
        Article article2 = new Article();
        article2.setAuthorId(2);
        article1.setAuthorId(2);
        articleRepository.save(article1);
        articleRepository.save(article2);
        assertEquals(3, articleRepository.count());
        List<Article> list;
        list = articleRepository.findByAuthorId(2);
        assertEquals(2, list.size());
        assertTrue(list.contains(article1));
        assertTrue(list.contains(article2));
    }
}


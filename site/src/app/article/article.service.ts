import { Injectable } from '@angular/core';
import { Article } from './article.model';

@Injectable({
  providedIn: 'root'
})
export class ArticleService {

  constructor() { }

  public getArticles(): Article[] {
    const articleToLet: Article[] = [];

    for (let i = 1; i <= 10; i++) {
      const article: Articulo = new Article(i,())
    }
  }
}

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class Main  {
    public static void Writer(String s){
       try {
           FileWriter writer = new FileWriter(("C://Users//Heranuka//Desktop//auto3.doc"),true);
        //   writer.write("Все машины Крыма которые дешевле 50к рублей!!!");
           writer.append(s);
           writer.append("\n");
           writer.flush();
           writer.close();
       }
       catch (IOException e){
           System.out.println("Не удалось записать в файл ");
       }
    }
   static int i = 1;
    private static Document getDocument()throws IOException{
        String url = "https://www.avito.ru/respublika_krym/avtomobili?pmax=50000&pmin=0";
        Document page = Jsoup.parse(new URL(url),10000);
        return page;
    }
    public static void main(String[] args) throws IOException{
        Document page = getDocument();
        Elements elementes = page.select("div[class = item item_table clearfix js-catalog-item-enum  item-with-contact js-item-extended]");
        Writer("Все машины Крыма которые дешевле 50к рублей!!!"+"\n");
        System.out.println("Все машины Крыма которые дешевле 50к рублей!!!");
        for(Element elements1:elementes){
            Element model = elements1.selectFirst("span[itemprop = name]");
            Element price = elements1.selectFirst("span[class= price]");
            Element info = elements1.selectFirst("div[class = specific-params specific-params_block]");
            Element date = elements1.selectFirst("div[class = data]");
            Writer("**********************"+"\n");
            Writer("Машина номер   "+ i +"   "+ model.text()+ "   "+price.text()+ "   "+ info.text()+ "    "+ date.text()+"\n");
            System.out.println("**********************");
            System.out.println( "Машина номер   "+ i +"   "+ model.text()+ "   "+price.text()+ "   "+ info.text()+ "    "+ date.text());
            i++;
        }
Document page2 = Jsoup.parse(new URL("https://www.avito.ru/respublika_krym/avtomobili?p=2&cd=1&pmax=50000&pmin=0"),50000);
        Elements elementes2 = page2.select("div[class = item item_table clearfix js-catalog-item-enum  item-with-contact js-item-extended]");
      //  System.out.println("Все машины Крыма которые дешевле 50к рублей!!!");
        for(Element elements1:elementes2){
            Element model = elements1.selectFirst("span[itemprop = name]");
            Element price = elements1.selectFirst("span[class= price]");
            Element info = elements1.selectFirst("div[class = specific-params specific-params_block]");
            Element date = elements1.selectFirst("div[class = data]");
            Writer("**********************"+"\n");
            Writer("Машина номер   "+ i +"   "+ model.text()+ "   "+price.text()+ "   "+ info.text()+ "    "+ date.text()+"\n");
            System.out.println("**********************");
            System.out.println( "Машина номер   "+ i +"   "+ model.text()+ "   "+price.text()+ "   "+ info.text()+ "    "+ date.text());
            i++;
        }
        Document page3 = Jsoup.parse(new URL("https://www.avito.ru/respublika_krym/avtomobili?p=3&cd=1&pmax=50000&pmin=0"),50000);
        Elements elementes3 = page3.select("div[class = item item_table clearfix js-catalog-item-enum  item-with-contact js-item-extended]");
     //   System.out.println("Все машины Крыма которые дешевле 50к рублей!!!");
        for(Element elements1:elementes3){
            Element model = elements1.selectFirst("span[itemprop = name]");
            Element price = elements1.selectFirst("span[class= price]");
            Element info = elements1.selectFirst("div[class = specific-params specific-params_block]");
            Element date = elements1.selectFirst("div[class = data]");
            Writer("**********************"+"\n");
            Writer("Машина номер   "+ i +"   "+ model.text()+ "   "+price.text()+ "   "+ info.text()+ "    "+ date.text()+"\n");
           System.out.println("**********************");
            System.out.println( "Машина номер   "+ i +"   "+ model.text()+ "   "+price.text()+ "   "+ info.text()+ "    "+ date.text());
            i++;
        }
        Document page4 = Jsoup.parse(new URL("https://www.avito.ru/respublika_krym/avtomobili?p=4&cd=1&pmax=50000&pmin=0"),50000);
        Elements elementes4 = page4.select("div[class = item item_table clearfix js-catalog-item-enum  item-with-contact js-item-extended]");
     //   System.out.println("Все машины Крыма которые дешевле 50к рублей!!!");
        for(Element elements1:elementes4){
            Element model = elements1.selectFirst("span[itemprop = name]");
            Element price = elements1.selectFirst("span[class= price]");
            Element info = elements1.selectFirst("div[class = specific-params specific-params_block]");
            Element date = elements1.selectFirst("div[class = data]");
            Writer("**********************"+"\n");
            Writer("Машина номер   "+ i +"   "+ model.text()+ "   "+price.text()+ "   "+ info.text()+ "    "+ date.text()+"\n");
            System.out.println("**********************");
            System.out.println( "Машина номер   "+ i +"   "+ model.text()+ "   "+price.text()+ "   "+ info.text()+ "    "+ date.text());
            i++;
        }
        Document page5 = Jsoup.parse(new URL("https://www.avito.ru/respublika_krym/avtomobili?p=5&cd=1&pmax=50000&pmin=0"),50000);
        Elements elementes5 = page5.select("div[class = item item_table clearfix js-catalog-item-enum  item-with-contact js-item-extended]");
     //   System.out.println("Все машины Крыма которые дешевле 50к рублей!!!");
        for(Element elements1:elementes5){
            Element model = elements1.selectFirst("span[itemprop = name]");
            Element price = elements1.selectFirst("span[class= price]");
            Element info = elements1.selectFirst("div[class = specific-params specific-params_block]");
            Element date = elements1.selectFirst("div[class = data]");
            Writer("**********************"+"\n");
            Writer("Машина номер   "+ i +"   "+ model.text()+ "   "+price.text()+ "   "+ info.text()+ "    "+ date.text()+"\n");
            System.out.println("**********************");
            System.out.println( "Машина номер   "+ i +"   "+ model.text()+ "   "+price.text()+ "   "+ info.text()+ "    "+ date.text());
            i++;
        }
        Document page6 = Jsoup.parse(new URL("https://www.avito.ru/respublika_krym/avtomobili?p=6&cd=1&pmax=50000&pmin=0"),50000);
        Elements elementes6 = page6.select("div[class = item item_table clearfix js-catalog-item-enum  item-with-contact js-item-extended]");
      //  System.out.println("Все машины Крыма которые дешевле 50к рублей!!!");
        for(Element elements1:elementes6){
            Element model = elements1.selectFirst("span[itemprop = name]");
            Element price = elements1.selectFirst("span[class= price]");
            Element info = elements1.selectFirst("div[class = specific-params specific-params_block]");
            Element date = elements1.selectFirst("div[class = data]");
            Writer("**********************"+"\n");
            Writer("Машина номер   "+ i +"   "+ model.text()+ "   "+price.text()+ "   "+ info.text()+ "    "+ date.text()+"\n");
            System.out.println("**********************");
            System.out.println( "Машина номер   "+ i +"   "+ model.text()+ "   "+price.text()+ "   "+ info.text()+ "    "+ date.text());
            i++;
        }
        Document page7 = Jsoup.parse(new URL("https://www.avito.ru/respublika_krym/avtomobili?p=7&cd=1&pmax=50000&pmin=0"),50000);
        Elements elementes7 = page7.select("div[class = item item_table clearfix js-catalog-item-enum  item-with-contact js-item-extended]");
      //  System.out.println("Все машины Крыма которые дешевле 50к рублей!!!");
        for(Element elements1:elementes7){
            Element model = elements1.selectFirst("span[itemprop = name]");
            Element price = elements1.selectFirst("span[class= price]");
            Element info = elements1.selectFirst("div[class = specific-params specific-params_block]");
            Element date = elements1.selectFirst("div[class = data]");
            Writer("**********************"+"\n");
            Writer("Машина номер   "+ i +"   "+ model.text()+ "   "+price.text()+ "   "+ info.text()+ "    "+ date.text()+"\n");
            System.out.println("**********************");
            System.out.println( "Машина номер   "+ i +"   "+ model.text()+ "   "+price.text()+ "   "+ info.text()+ "    "+ date.text());
            i++;
        }

    }
}

package de.sb.emojitracker;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class Crawler {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.emojitracker.com/api/rankings"); 
		URLConnection connection = url.openConnection();
		InputStream inputStream = connection.getInputStream();
		JsonReader jsonReader = Json.createReader(inputStream);
		JsonArray jsonArray = jsonReader.readArray();
		ArrayList<Emoji> emojiData = new ArrayList<>();
		jsonArray.forEach(v -> {
			JsonObject jsonObject = (JsonObject) v;
			Emoji emoji = new Emoji();			
			emoji.setCharacter(jsonObject.getString("char"));
			emoji.setId(jsonObject.getString("id"));
			emoji.setName(jsonObject.getString("name"));
			emoji.setScore(jsonObject.getInt("score"));
			emojiData.add(emoji);			
		});				
		
		// alle Daten stehen jetzt in der Liste emojiData
		
		// TODO: csv-Datei erzeugen		
		emojiData.forEach(v -> {
			System.out.println("char:" + v.getCharacter() + " id:" + v.getId()
			+ " name:" + v.getName() + " score:" + v.getScore());
			// und die Zeilen der Liste anhängen
		});

	}

}

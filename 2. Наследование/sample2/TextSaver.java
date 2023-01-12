package sample2;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class TextSaver {
	private TextTransformer transformer;
	private File file;

	public TextSaver(TextTransformer transformer, File file) {
		super();
		this.transformer = transformer;
		this.file = file;
	}
	
	public TextTransformer getTransformer() {
		return transformer;
	}

	public void setTransformer(TextTransformer transformer) {
		this.transformer = transformer;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public void saveTextToFile(String text) {
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println(transformer.transform(text));
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	@Override
	public String toString() {
		return "TextSaver [transformer=" + transformer + ", file=" + file + "]";
	}
	
}

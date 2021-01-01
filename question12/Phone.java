package Assignment_14_OOP.question12;

public class Phone {

	int imageSize;
	int memorySize;

	public Phone(int imageSize, int memorySize) {

		this.imageSize = imageSize;
		this.memorySize = memorySize;
	}

	public int numPictures() {

		return memorySize*1000 / imageSize;
	}

}

import MusicClass.Music;

public class MusicClass {
	
	//private instances
	private Music head;
	private Music tail;
	private int size;

	
	public MusicClass() {
		head = tail = null;
		size = 0;
	}

	private class Music {
		private Music next;
		private Music prev;
		private String song;
		private String artist;

		//constructor that accepts the song and artist names
		public Music(String song, String artist) {
			this.artist = artist;
			this.song = song;
			next = prev = null;
			getNext();
			getPrev();	
		}
		
		//accessors and mutators
		public Music getNext() {
			return next;
		}
		
		public Music getPrev() {
			return prev;
		}
		public void setNext(Music next) {
			this.next = next;
		}
		
		public void setPrevious(Music prev) {
			this.prev = prev;
		}
	}
	public int size() {
		return size;
		}
	
	public void add(String song, String artist) {
		
		Music newMusic = new Music(song, artist);
		
		if (head == null) {
	     
			head = newMusic;
			tail = newMusic;
		}			else
		{
			newMusic.setPrevious(tail);
			tail.setNext(newMusic);
			tail = newMusic;
		}
//			System.out.println("1st Song: " + song + " and the artist is " + artist);

		size++;
		return;
		}

	public void insert(String song, String artist) {
		Music newMusic = new Music(song, artist);
		
		if (size == 0) {
			head = tail = new Music(song, artist);
			size++;
			System.out.println("Insert: " + song + " and the artist is " + artist);
			return;
		}
		
		else {
			
			Music thisSong = head;
			while (thisSong != null) {
				
				if (artist.compareTo(thisSong.artist) < 0) {
					
					thisSong.prev = newMusic.next;
					thisSong.prev = newMusic;
					size++;
					
					return;
				}
				else{
					newMusic.setNext(thisSong);
					newMusic.setPrevious(thisSong.getPrev());
					thisSong.getPrev().setNext(newMusic);
					thisSong.setPrevious(newMusic);
					return;
				}
				
			}
			
			add(song, artist);
			return;
		}
	}

	public Music search(String artist) {

		Music m = head;
		while (m != null) {
			if (m.artist.equals(artist))
				return m;
			else
				m = m.next;
		}
		return null;
		}
		
		public void print()
		{
			Music thisSong = head;
			
			System.out.println(" ");
			
			while (thisSong != null)
			{
				System.out.println(thisSong);
				thisSong = thisSong.getNext();
			}
		}
		
		public static void main(String[] args) {
			
			MusicClass l = new MusicClass();
			l.print();
			l.add(3);
			l.print();
			l.add(7);
			l.print();
			l.insert(5);
			l.print();
			l.insert(6);
			l.print();
			l.insert(12);
			l.print();
			l.insert(1);
			l.print();
			
		}
		public String toString()
		{
			return size.toString();
		}
		
		
	}

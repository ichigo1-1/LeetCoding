public class Codec {

    // Encodes a URL to a shortened URL.
    HashMap<String,String>hm=new HashMap<>();
    public String encode(String longUrl) {
        StringBuilder sb=new StringBuilder();
        sb.append((char)Math.floor(Math.random()*100));
        while(hm.containsKey((char)Math.floor(Math.random()*100)))
        {
            sb.append((char)Math.floor(Math.random()*100));
        }
        hm.put(sb.toString(),longUrl);
        return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return hm.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
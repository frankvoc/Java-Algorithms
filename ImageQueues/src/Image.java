public class Image {
    public String imageName;
    public String imageReso;
    public String getImageName() {
        return imageName;
    }
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
    public String getImageReso() {
        return imageReso;
    }
    public void setImageReso(String imageReso) {
        this.imageReso = imageReso;
    }
    public Image(String imageName, String imageReso){
        this.imageName = imageName;
        this.imageReso = imageReso;
    }
    public String toString(){
        return"Name of Image: " + imageName + ", Image Resolution: " + imageReso;
    }
}

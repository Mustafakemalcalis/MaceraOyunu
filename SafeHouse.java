public class SafeHouse extends NormalLoc {
    
    SafeHouse(Player player) {
        super(player,"Güvenli Ev");
    }
    
    public boolean getLocation () {
        player.setHealty(player.getrHealthy());
        System.out.println("İyileştiniz...");
        System.out.println("Şu an Güvenli Evdesiniz.");
        return true;
    }
}

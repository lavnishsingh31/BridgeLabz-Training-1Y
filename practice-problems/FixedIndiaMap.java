public class FixedIndiaMap {
    public static void main(String[] args) {
        printIndiaMap();
    }
    
    static void printIndiaMap() {
        boolean[][] map = new boolean[50][100];
        drawSafeIndia(map);
        
        int i = 0;
        while (i < 50) {
            int j = 0;
            while (j < 100) {
                System.out.print(map[i][j] ? "*" : " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
    static void drawSafeIndia(boolean[][] map) {
        // Kashmir - SAFE bounds (0-49 rows, 0-99 cols)
        drawSafeRegion(map, 4, 38, 10, 58);
        
        // Northern Plains
        drawSafeRegion(map, 12, 25, 17, 72);
        drawSafeRegion(map, 14, 22, 16, 75);
        
        // Rajasthan
        drawSafeRegion(map, 18, 15, 24, 55);
        
        // Gujarat
        drawSafeRegion(map, 22, 8, 30, 28);
        
        // Central India
        drawSafeRegion(map, 25, 28, 34, 72);
        
        // Maharashtra
        drawSafeRegion(map, 30, 12, 38, 45);
        
        // Deccan Plateau
        drawSafeRegion(map, 32, 45, 40, 75);
        
        // Karnataka
        drawSafeRegion(map, 38, 35, 44, 58);
        
        // Kerala
        drawSafeRegion(map, 42, 25, 48, 40);
        
        // Tamil Nadu
        drawSafeRegion(map, 40, 42, 48, 55);
        
        // Andhra Pradesh
        drawSafeRegion(map, 34, 60, 44, 78);
        
        // Islands (Andaman)
        drawSafeRegion(map, 8, 88, 12, 95);
        drawSafeRegion(map, 9, 90, 11, 93);
        
        // Lakshadweep
        drawSafeRegion(map, 46, 82, 48, 87);
    }
    
    static void drawSafeRegion(boolean[][] map, int r1, int c1, int r2, int c2) {
        int r = Math.max(0, r1);
        while (r <= Math.min(49, r2)) {
            int c = Math.max(0, c1);
            while (c <= Math.min(99, c2)) {
                map[r][c] = true;
                c++;
            }
            r++;
        }
    }
}

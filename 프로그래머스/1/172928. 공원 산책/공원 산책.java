class Solution {
    public int[] solution(String[] park, String[] routes) {
        int H = park.length;
        int W = park[0].length();
        
        int row = 0, col = 0;
        for (int i = 0; i < H; i++) {
            int sIndex = park[i].indexOf('S');
            if (sIndex != -1) {
                row = i;
                col = sIndex;
                break;
            }
        }
        
        ROUTE_LOOP:
        for (String route : routes) {
            String[] parts = route.split(" ");
            char direction = parts[0].charAt(0);
            int distance = Integer.parseInt(parts[1]);
            
            int originalRow = row;
            int originalCol = col;
            
            for (int i = 0; i < distance; i++) {
                switch (direction) {
                    case 'N': row--; break;
                    case 'S': row++; break;
                    case 'W': col--; break;
                    case 'E': col++; break;
                }
                
                                
                if (row < 0 || row >= H || col < 0 || col >= W || park[row].charAt(col) == 'X') {
                    row = originalRow;
                    col = originalCol;
                    continue ROUTE_LOOP;
                }
            }
        }
        return new int[]{row, col};
    }
}
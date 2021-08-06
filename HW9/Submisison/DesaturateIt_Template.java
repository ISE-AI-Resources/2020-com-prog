
import java.io.File;

public class DesaturateIt_Template{
	public static void main(String [] args){
		int [][][] rgb = Java101ImageUtil.getRGBArrayFromFile();
		if(rgb==null){return;}
		int[][][] gray = grayscale(rgb);
		int[][][] sepia = sepia(rgb);
		// fill code to show all three images
		// - original, grayscale, sepia
		int[][][][] rgbs = {rgb,gray,sepia};
		Java101ImageUtil.showViewer(rgbs, "show all");
	}

	public static int [][][] grayscale(int [][][] rgb) {
		int[][][] grey = new int[rgb.length][rgb[0].length][3];
		for(int i = 0; i < rgb.length; i++) {
			for(int j = 0; j < rgb[i].length; j++) {
				for(int k = 0; k < rgb[i][j].length; k++) {
					grey[i][j][k] = rgb[i][j][k];	
				}
			}
		}
		for(int i = 0; i < grey.length; i++) {
			for(int j = 0; j < grey[i].length; j++) {
				float cnt = 0;
				for(int k = 0; k < grey[i][j].length; k++) {
					cnt += (float) grey[i][j][k];
				}
				cnt /= 3;
				for(int k = 0; k < grey[i][j].length; k++) {
					grey[i][j][k] = (int) cnt;
				}
			}
		}
		return grey;
	}

	public static int [][][] sepia(int [][][] rgb) {
		int[][][] sepia = new int[rgb.length][rgb[0].length][3];
		for(int i = 0; i < rgb.length; i++) {
			for(int j = 0; j < rgb[i].length; j++) {
				for(int k = 0; k < rgb[i][j].length; k++) {
					sepia[i][j][k] = rgb[i][j][k];	
				}
			}
		}
		for(int i = 0; i < sepia.length; i++) {
			for(int j = 0; j < sepia[i].length; j++) {
				int red = sepia[i][j][0];
				int green = sepia[i][j][1];
				int blue = sepia[i][j][2];
				
				sepia[i][j][0] = (int) Math.min((0.393*red + 0.769*green + 0.189*blue ), 255.0);
				sepia[i][j][1] = (int) Math.min((0.349*red + 0.686*green + 0.168*blue ), 255.0);
				sepia[i][j][2] = (int) Math.min((0.272*red + 0.534*green + 0.131*blue ), 255.0);
			}
		}
		return sepia;
	}
}
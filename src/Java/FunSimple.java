		package Java;
		
		public class FunSimple {
			/*
			 *  Java doesn't have Deconstructors 
			 *  Java is is a grabage collected language,and that mean java do garbage for
			 *  any available that no longer use 
			 *  and it can't predict when an object will be destroyed  
			 */
			static float pi = 3.14F;
			
			float sum(float x) {
				float sum = x+ 5;
				return sum;
			}
			float sum(int x) {
				return 5;
			}
			float sum(double y , double s) {
				return 4 * pi;
			}
			  void Draw() {
				for (int i =0 ; i < 5 ; i++) {
					System.out.println("*");
				}
			}
			public static void main(String[] args) {
				new  FunSimple().Draw();
				float x = new FunSimple().sum(5 ,6);
				System.out.println(x);
				FunSimple.pi = 3.5f;
		
			}
		
		}

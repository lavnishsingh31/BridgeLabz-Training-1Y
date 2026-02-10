class StringBufferExample {

		public static void main(String[] args) {

			System.out.println("append: " + sb);


// insert() adds text at a specified index



		sb.insert( 5,  ",");


			System.out.println("insert: " + sb);



// replace() replaces characters from start index to end index





		sb.replace( 6,  11,  "Java");


			System.out.println("replace: " + sb);

// delete() removes characters between start and end index



		sb.delete(5, 6);



			System.out.println("delete: " + sb);

		}
}

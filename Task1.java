����   @ �
      java/lang/Object <init> ()V  java/util/ArrayDeque
    3      java/util/Deque add (Ljava/lang/Object;)Z  2  1  -  6  5  4  java/lang/StringBuilder
    " # $ size ()I  & ' ( pollLast ()Ljava/lang/Object; * java/lang/String
  , - . append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  0  1 (Ljava/lang/CharSequence;)V
  3 4 5 toString ()Ljava/lang/String;
 7 8 9 : ; java/lang/Integer parseInt (Ljava/lang/String;)I	 = > ? @ A java/lang/System out Ljava/io/PrintStream;
 C D E F G java/io/PrintStream println (I)V   I J K makeConcatWithConstants (I)Ljava/lang/String;
 ) M N O toCharArray ()[C Q java/util/LinkedList
 P 
 T U V W X java/lang/Character valueOf (C)Ljava/lang/Character;
 P 
 C [ F \ (Ljava/lang/Object;)V ^ Task1 Code LineNumberTable LocalVariableTable this LTask1; main ([Ljava/lang/String;)V i I args [Ljava/lang/String; deq1 Ljava/util/Deque; deq2 sb1 Ljava/lang/StringBuilder; sb2 num1 Ljava/lang/String; num2 number1 number2 prod sum prodStr sumStr chars [C prodStrList Ljava/util/LinkedList; chars2 
sumStrList LocalVariableTypeTable %Ljava/util/Deque<Ljava/lang/String;>; -Ljava/util/LinkedList<Ljava/lang/Character;>; StackMapTable i z 
SourceFile 
Task1.java BootstrapMethods �
 � � � J � $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; �  InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup ! ]           _   /     *� �    `        a        b c   	 d e  _  �    p� Y� 	L� Y� 	M+
�  W+�  W+�  W+�  W,�  W,�  W,�  W,�  W� Y�  N+� ! d6� -+� % � )� +W����� Y�  :,� ! d6� ,� % � )� +W����� Y-� /� 2:� Y� /� 2:� 66� 66h6	`6
� <
� B	� H  :
� H  :� L:� PY� R:6�� 4� S� YW���� <� Z� L:� PY� R:6�� 4� S� YW���� <� Z�    `   � (       	  
 "  +  4  =  F  O  X  `  o  }  �  �  �  �  �  �  �  �  �  �  �  �   � ! " # $ %* $0 '8 (? )H *S +a *g -o . a   �  j  f g  �  f g   f g K  f g   p h i   h j k  ` l k  ` m n  � � o n  � � p q  � � r q  � � s g  � � t g  � � u g 	 � � v g 
 � x w q  o x q  h y z  _ { | ? 1 } z H ( ~ |     *  h j �  ` l �  _ { � H ( ~ �  �   ` � j  �     � �  � � c  �     ) ) ) ) � P  � �  � P�   �    � �     �  � �   
  � � � 
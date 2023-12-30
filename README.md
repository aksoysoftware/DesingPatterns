# DesingPatterns(Tasarım Desenleri)

# 1. YAZILIM TASARIM DESENLİ KILAVUZU 🎨

## 1.1 GİRİŞ 🚀

 Bu repo, Yazılım Tasarımı Mimarisi dersinde öğrendiğim tasarım kalıpları ve örnekleri. Tasarım Desenleri kodunuzu daha okunabilir, ölçeklenebilir ve bakımı daha kolay hale getirmek için güçlü tasarım prensipleri sunar.

## 1.2 NEDEN TASARIM DESENLİ KULLANMALIYIZ?

Yazılım tasarım desenleri kullanmak, bir projenin karmaşıklığını yönetmek ve kodunuzun uzun vadeli sağlığını güvence altına almak için önemlidir.

- **Esneklik ve Değiştirilebilirlik:** Tasarım desenleri, kodunuzu değişikliklere daha açık hale getirerek gelecekteki gereksinimlere adapte olmanıza yardımcı olur.

- **Anlaşılabilirlik:** Tasarım desenleri, belirli bir tasarımın amacını ve nasıl çalıştığını anlamayı kolaylaştırır, bu da kodunuzu daha okunabilir kılar.

- **Tekrar Kullanılabilirlik:** Desenler, benzer problemlerle karşılaşıldığında tekrar kullanılabilen modüler çözümler sağlar.


## 2. CREATIONAL DESENLİR 🛠️

### 2.1 SINGLETON - TEK VARLIK

Singleton deseni, programınızda yalnızca bir örnek oluşturulmasını sağlar. Bu örnek, bir kaynağa tek bir noktadan erişim sağlar.
https://upload.wikimedia.org/wikipedia/commons/d/dc/Singleton_pattern_uml.png
Uygulamanın yaşam süresince bir nesnenin bir kez oluşturulmasını sağlar.

### 2.2 FACTORY - FABRİKA

Factory deseni, nesne oluşturma sürecini soyutlar ve istemcilerin hangi nesnenin oluşturulacağına karar vermesini kolaylaştırır.
https://upload.wikimedia.org/wikipedia/commons/8/8e/Factory_Method_UML_class_diagram.svg

İstemcilerin spesifik sınıfların oluşturulmasını bilmesine gerek olmadığı durumlarda kullanılır.

### 2.3 ABSTRACT FACTORY - SOYUT FABRİKA

Abstract Factory deseni, ilgili nesne ailelerini oluşturan soyut bir arayüz sağlar. Bir nesne ailesini değiştirmek istediğinizde kullanışlıdır.

https://upload.wikimedia.org/wikipedia/commons/6/67/Abstract_Factory_UML_class_diagram.svg
Bir nesne ailesini değiştirmeniz ve bununla uyumlu nesneleri oluşturmanız gerektiğinde AbstractFactory kullanırız.

### 2.4 BUILDER - YAPI TAŞÇISI

Builder deseni, karmaşık nesneleri adım adım oluşturmayı sağlar. Bu sayede farklı temsilciler oluşturabilir ve yapıyı daha iyi kontrol edebilirsiniz.
https://upload.wikimedia.org/wikipedia/commons/f/f3/Builder_UML_class_diagram.svg
Karmaşık nesneleri adım adım oluşturmanız gerektiğinde builder tasarım desenini kullanırız.

## 3. STRUCTURAL DESENLİR 🏗️

### 3.1 ADAPTER - UYUM ADAPTÖRÜ

Adapter deseni, bir nesnenin arabirimini başka birine uyumlu hale getirir, bir tür çevirmen görevi görür.

### 3.2 FACADE - CEPHANELİK

Facade deseni, alt sistemlerin karmaşıklığını gizleyen ve istemciye sadece basitleştirilmiş bir arayüz sunan bir yapı sağlar.

### 3.3 BRIDGE - KÖPRÜ

Bridge deseni, soyutlamayı uygulamadan ayırarak, bağlamaları daha esnek ve değiştirilebilir hale getirir.

### 3.4 COMPOSITE - BİLEŞİK

Composite deseni, nesneleri hiyerarşik bir ağaç yapısında birleştirir, böylece tek bir nesne gibi davranabilirler.

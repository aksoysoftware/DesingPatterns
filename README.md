# DesingPatterns(Tasarım Desenleri)

# 1. YAZILIM TASARIM DESENLERİ

## 1.1 GİRİŞ 🚀

 Bu repo, Yazılım Tasarımı Mimarisi dersinde öğrendiğim tasarım kalıpları ve örnekleri. Tasarım Desenleri kodunuzu daha okunabilir, ölçeklenebilir ve bakımı daha kolay hale getirmek için güçlü tasarım prensipleri sunar.

## 1.2 NEDEN TASARIM DESENLİ KULLANMALIYIZ?

Yazılım tasarım desenleri kullanmak, bir projenin karmaşıklığını yönetmek ve kodunuzun uzun vadeli sağlığını güvence altına almak için önemlidir.

- **Esneklik ve Değiştirilebilirlik:** Tasarım desenleri, kodunuzu değişikliklere daha açık hale getirerek gelecekteki gereksinimlere adapte olmanıza yardımcı olur.

- **Anlaşılabilirlik:** Tasarım desenleri, belirli bir tasarımın amacını ve nasıl çalıştığını anlamayı kolaylaştırır, bu da kodunuzu daha okunabilir kılar.

- **Tekrar Kullanılabilirlik:** Desenler, benzer problemlerle karşılaşıldığında tekrar kullanılabilen modüler çözümler sağlar.


## 2. CREATIONAL DESENLER 🛠️

### 2.1 SINGLETON - TEK VARLIK

Singleton deseni, programınızda yalnızca bir örnek oluşturulmasını sağlar. Bu örnek, bir kaynağa tek bir noktadan erişim sağlar.
![image](https://github.com/aksoysoftware/DesingPatterns/assets/99371051/58ee1073-e8aa-4edf-bc4f-5998a8508088)


Uygulamanın yaşam süresince bir nesnenin bir kez oluşturulmasını sağlar.

### 2.2 FACTORY - FABRİKA

Factory deseni, nesne oluşturma sürecini soyutlar ve istemcilerin hangi nesnenin oluşturulacağına karar vermesini kolaylaştırır.
![image](https://github.com/aksoysoftware/DesingPatterns/assets/99371051/82f5890b-80cc-4347-9951-10eabb5e7d85)

İstemcilerin spesifik sınıfların oluşturulmasını bilmesine gerek olmadığı durumlarda kullanılır.

### 2.3 ABSTRACT FACTORY - SOYUT FABRİKA

Abstract Factory deseni, ilgili nesne ailelerini oluşturan soyut bir arayüz sağlar. Bir nesne ailesini değiştirmek istediğinizde kullanışlıdır.

![image](https://github.com/aksoysoftware/DesingPatterns/assets/99371051/fbaa35c3-7a4e-490f-806c-741e8b7069ad)


Bir nesne ailesini değiştirmeniz ve bununla uyumlu nesneleri oluşturmanız gerektiğinde AbstractFactory kullanırız.

### 2.4 BUILDER - YAPI TAŞÇISI

Builder deseni, karmaşık nesneleri adım adım oluşturmayı sağlar. Bu sayede farklı temsilciler oluşturabilir ve yapıyı daha iyi kontrol edebilirsiniz.
![image](https://github.com/aksoysoftware/DesingPatterns/assets/99371051/f635c449-7b08-4d46-a42f-60c9753bf0f2)

Karmaşık nesneleri adım adım oluşturmanız gerektiğinde builder tasarım desenini kullanırız.

## 3. STRUCTURAL DESENLER 🏗️

### 3.1 ADAPTER - ADAPTÖR

Adapter deseni, bir nesnenin arabirimini başka birine uyumlu hale getirir, bir tür çevirmen görevi görür.

### 3.2 FACADE - CEPHE

Facade deseni, alt sistemlerin karmaşıklığını gizleyen ve istemciye sadece basitleştirilmiş bir arayüz sunan bir yapı sağlar.

### 3.3 BRIDGE - KÖPRÜ

Bridge deseni, soyutlamayı uygulamadan ayırarak, bağlamaları daha esnek ve değiştirilebilir hale getirir.

### 3.4 COMPOSITE - BİLEŞİK

Composite deseni, nesneleri hiyerarşik bir ağaç yapısında birleştirir, böylece tek bir nesne gibi davranabilirler.

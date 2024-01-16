# Tasarım Desenleri (Design Patterns)

## 1. YAZILIM TASARIM DESENLERİ

### 1.1 GİRİŞ 🚀

Bu repo, Yazılım Tasarımı Mimarisi dersinde öğrendiğim tasarım kalıpları ve örneklerini içerir. Tasarım Desenleri, kodunuzu daha okunabilir, ölçeklenebilir ve bakımı daha kolay hale getirmek için güçlü tasarım prensipleri sunar.

### 1.2 NEDEN TASARIM DESENLİ KULLANMALIYIZ?

Yazılım tasarım desenleri kullanmak, bir projenin karmaşıklığını yönetmek ve kodunuzun uzun vadeli sağlığını güvence altına almak için önemlidir.

- **Esneklik ve Değiştirilebilirlik:** Tasarım desenleri, kodunuzu değişikliklere daha açık hale getirerek gelecekteki gereksinimlere adapte olmanıza yardımcı olur.

- **Anlaşılabilirlik:** Tasarım desenleri, belirli bir tasarımın amacını ve nasıl çalıştığını anlamayı kolaylaştırır, bu da kodunuzu daha okunabilir kılar.

- **Tekrar Kullanılabilirlik:** Desenler, benzer problemlerle karşılaşıldığında tekrar kullanılabilen modüler çözümler sağlar.

## 2. CREATIONAL DESENLER 🛠️

### 2.1 SINGLETON - TEK VARLIK

Singleton deseni, programınızda yalnızca bir örnek oluşturulmasını sağlar. Bu örnek, bir kaynağa tek bir noktadan erişim sağlar.

![image](https://github.com/aksoysoftware/DesingPatterns/assets/99371051/36f177e9-46f0-441e-be5f-683a2b179e16)


Uygulamanın yaşam süresince bir nesnenin bir kez oluşturulmasını sağlar.


### 2.2 FACTORY - FABRİKA

Factory deseni, nesne oluşturma sürecini soyutlar ve istemcilerin hangi nesnenin oluşturulacağına karar vermesini kolaylaştırır.

![Factory](https://github.com/aksoysoftware/DesingPatterns/assets/99371051/82f5890b-80cc-4347-9951-10eabb5e7d85)

İstemcilerin spesifik sınıfların oluşturulmasını bilmesine gerek olmadığı durumlarda kullanılır.

### 2.3 ABSTRACT FACTORY - SOYUT FABRİKA

Abstract Factory deseni, ilgili nesne ailelerini oluşturan soyut bir arayüz sağlar. Bir nesne ailesini değiştirmek istediğinizde kullanışlıdır.

![Abstract Factory](https://github.com/aksoysoftware/DesingPatterns/assets/99371051/fbaa35c3-7a4e-490f-806c-741e8b7069ad)

Bir nesne ailesini değiştirmeniz ve bununla uyumlu nesneleri oluşturmanız gerektiğinde Abstract Factory kullanırız.

### 2.4 BUILDER - YAPI TAŞÇISI

Builder deseni, karmaşık nesneleri adım adım oluşturmayı sağlar. Bu sayede farklı temsilciler oluşturabilir ve yapıyı daha iyi kontrol edebilirsiniz.

![Builder](https://github.com/aksoysoftware/DesingPatterns/assets/99371051/f635c449-7b08-4d46-a42f-60c9753bf0f2)

Karmaşık nesneleri adım adım oluşturmanız gerektiğinde builder tasarım desenini kullanırız.

## 3. STRUCTURAL DESENLER 🏗️

### 3.1 ADAPTER - ADAPTÖR

Adapter deseni, bir nesnenin arabirimini başka birine uyumlu hale getirir, bir tür çevirmen görevi görür.
![image](https://github.com/aksoysoftware/DesingPatterns/assets/99371051/b67baba5-bc55-43a3-aa90-237614136991)




### 3.2 FACADE - CEPHE

Facade deseni, alt sistemlerin karmaşıklığını gizleyen ve istemciye sadece basitleştirilmiş bir arayüz sunan bir yapı sağlar.
![image](https://github.com/aksoysoftware/DesingPatterns/assets/99371051/c6190467-a4e3-4129-a01e-55622930f417)


### 3.3 BRIDGE - KÖPRÜ

Bridge deseni, soyutlamayı uygulamadan ayırarak, bağlamaları daha esnek ve değiştirilebilir hale getirir.
![image](https://github.com/aksoysoftware/DesingPatterns/assets/99371051/faad5ffc-a378-49d7-b46e-033a693f5a57)



### 3.4 COMPOSITE - BİLEŞİK

Composite deseni, nesneleri hiyerarşik bir ağaç yapısında birleştirir, böylece tek bir nesne gibi davranabilirler.
![image](https://github.com/aksoysoftware/DesingPatterns/assets/99371051/a3b29722-547f-44c6-a313-eec33747fced)

## 4. BEHAVIORAL (DAVRANISSAL) DESENLER 🔄
### 4.1 CHAIN OF RESPONSIBILITY - SORUMLULUK ZİNCİRİ
Chain of Responsibility deseni, isteği işleyen nesneler arasında bir zincir oluşturur. İsteği işleyebilen nesne bulunana kadar zincir boyunca ilerler.

![image](https://github.com/aksoysoftware/DesingPatterns/assets/99371051/ccfadb16-c5e9-41b4-84cc-c9b2b0308bbc)

Bir isteği işlemek için birden çok nesnenin sırayla denendiği durumlarda kullanılır.

### 4.2 VISITOR - ZİYARETÇİ
Visitor deseni, nesnelerin üzerinde belirli işlemleri gerçekleştiren ayrı bir nesne hiyerarşisi ekler.
![image](https://github.com/aksoysoftware/DesingPatterns/assets/99371051/2f9f7701-2fab-454a-b408-28bc2a898bff)


Bir nesnenin üzerinde farklı işlemleri gerçekleştirmeniz gerektiğinde kullanılır, böylece nesne hiyerarşisini değiştirmeden yeni işlemler ekleyebilirsiniz.

### 4.3 STRATEGY - STRATEJİ
Strategy deseni, bir algoritmanın farklı varyasyonlarını tanımlayan bir aile oluşturur ve bunları birbirine değiştirilebilir kılar.
![image](https://github.com/aksoysoftware/DesingPatterns/assets/99371051/249b1e7e-8050-4def-b6d5-97d19b59d8a1)


Belirli bir algoritmanın farklı uygulamalarını seçmeniz gerektiğinde kullanılır.

### 4.4 OBSERVER - GÖZLEMCİ
Observer deseni, bir nesnenin durumundaki değişiklikleri takip eden ve bu değişikliklere tepki veren bir dizi nesne tanımlar.
![image](https://github.com/aksoysoftware/DesingPatterns/assets/99371051/3c7ad4be-4ffe-4bd1-81c3-81f6fafcd5ac)


Bir nesnenin durumundaki değişiklikleri diğer nesnelere bildirmeniz gerektiğinde kullanılır.


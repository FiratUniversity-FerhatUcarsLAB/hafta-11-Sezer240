# Exercise 4.3 - Stack Diagram

**Durum:** `ping` metodu ilk kez çağrıldığında yığın (stack) yapısı.

Kod akışı: `main` -> `zoop` -> `baffle` -> `ping`

```text
|------------------------|
|         ping           | <--- En üstte (Aktif olan)
|------------------------|
| (Parametre yok)        |
|------------------------|
|           ^            |
|           |            |
|------------------------|
|        baffle          | <--- ping'i çağıran metod
|------------------------|
| (Parametre yok)        |
|------------------------|
|           ^            |
|           |            |
|------------------------|
|         zoop           | <--- baffle'ı çağıran metod
|------------------------|
| (Parametre yok)        |
|------------------------|
|           ^            |
|           |            |
|------------------------|
|         main           | <--- Programın başladığı yer
|------------------------|
| args: [ ]              |
|------------------------|

# Exercise 4.5 - Stack Diyagramı

**Durum:** `zoop` metodu ikinci kez çağrıldığında (yani `clink` metodunun içinden çağrıldığında) belleğin (Stack) durumu aşağıdaki gibidir.

| Metot (Frame) | Değişkenler ve Değerleri | Açıklama |
| :--- | :--- | :--- |
| **zoop** | `fred` $\rightarrow$ `"breakfast "`<br>`bob` $\rightarrow$ `4` | En üstteki (aktif) metot. `clink` tarafından çağrıldı. |
| **clink** | `fork` $\rightarrow$ `4` | `main` tarafından `2 * buzz` (yani 4) değeriyle çağrıldı. |
| **main** | `bizz` $\rightarrow$ `5`<br>`buzz` $\rightarrow$ `2` | Programın başladığı ana metot. |

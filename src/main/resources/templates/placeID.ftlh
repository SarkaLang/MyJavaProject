[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include "_common/head.ftlh"]
</head>
<body  style="background-image: url('/img/parking.jpg'); background-position: center; background-repeat: no-repeat">
<!-- Třída „container“ je z Bootstrapu a zařídí, že stránka se na šířku nebude zvětšovat donekonečna -->
<div class="container d-flex flex-column flex-grow-1 justify-content-between bg-white p-0" style="background-color: white">
    [#include "_common/header.ftlh"]
    <div class="px-3 py-3 my-4 text-center justify-content-center d-flex flex-wrap">
    <!-- Třídy Bootstrapu, zajistí centrování textu. -->
    </div>
    [#include "_common/footer.ftlh"]
</div>
<script crossorigin="anonymous"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
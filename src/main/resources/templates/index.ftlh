[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include "_common/head.ftlh"]
</head>
<body  style="background-image: url('/img/parking.jpg'); background-position: center; background-repeat: no-repeat">
<!-- Třída „container“ je z Bootstrapu a zařídí, že stránka se na šířku nebude zvětšovat donekonečna -->
<div class="container p-0" style="background-color: white">
        <!-- Třídy z Bootstrapu, které vytvoří menu. Třída „active“ označuje aktuální stránku – na stránkách pro datum a čas bude na odpovídajícíh položkách.-->
    [#include "_common/header.ftlh"]

    <!-- Třídy Bootstrapu, zajistí centrování textu. -->
    <div class="px-4 py-5 my-5 text-center" style="margin-bottom: 20px">

        <div class="row" style="margin-bottom: 40px; justify-content: center; align-items: center;">
            <div class="col-md-2">
                <label for="arrival-date" class="form-label fw-bold">Vyberte datum příjezdu</label>
                <input id="arrival-date" name="dateOfArrival" class="form-control" type="date" value=""/>
            </div>
            <div class="col-md-2 ms-4">
                <label for="departure-date" class="form-label fw-bold">Vyberte datum odjezdu</label>
                <input id="departure-date" name="dateOfDeparture" class="form-control" type="date" value=""/>
            </div>
            <div class="col-md-2 ms-4 d-flex justify-content-center align-items-center">
                <div class="fw-bold">Vybraný počet dní: </div>
            </div>
        </div>

        <h3 style="margin-bottom: 40px">Vyberte si parkovací místo</h3>

        <table class="table table-striped">
            <thead>
            <tr>
                <th scope="col">Status</th>
                <th scope="col">Parkovací místo</th>
                <th scope="col">Patro</th>
                <th scope="col">Cena</th>
                <th scope="col"></th>
            </tr>
            </thead>
            <tbody>
            [#list parkingPlace as parkingplace]
            <tr>
                <td>
                 <span class="fw-bold
                   [#if parkingplace.status == true]text-success[#else]text-danger[/#if]">
                   [#if parkingplace.status == true]VOLNO[#else]OBSAZENO[/#if]
                 </span>
                </td>
                <td>${parkingplace.parkingNumber}</td>
                <td>${parkingplace.numberOfFlour}</td>
                <td>${parkingplace.price} Kč</td>
                <td>
                    <a href="/${parkingplace?index}" class="btn btn-primary">Vybrat</a>
                </td>
            </tr>
            [/#list]
            </tbody>
        </table>
    </div>

    [#include "_common/footer.ftlh"]
</div>
<script crossorigin="anonymous"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

cd ~/workspaces/tapr-2024-turmaa-GESTAODEPROJETOSPES-java;
rm -rf ~/workspaces/tapr-2024-turmaa-GESTAODEPROJETOSPES-java/native.jks;
cd ~/workspaces/tapr-2024-turmaa-GESTAODEPROJETOSPES-java;
curl --insecure https://localhost:8081/_explorer/emulator.pem > ~/emulatorcert.crt;
sudo cp ~/emulatorcert.crt /usr/local/share/ca-certificates/;
sudo update-ca-certificates;

cd ~/workspaces/tapr-2024-turmaa-GESTAODEPROJETOSPES-java;
keytool -importcert -file ~/emulatorcert.crt -keystore native.jks -alias cosmosdb;
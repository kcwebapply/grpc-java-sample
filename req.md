grpcurl -plaintext -d '{"value":"hello"}'  -format json  -import-path src/main/proto  -proto src/main/proto/greet.proto localhost:6565 greet.Greet/greeting
